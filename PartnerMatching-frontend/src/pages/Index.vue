<template> 
<user-card-list :userList="userList" />
  <van-empty v-if="!userList || userList.length < 1" description="数据为空"  image="https://img.yzcdn.cn/vant/custom-empty-image.png"/>
</template>
<script setup>
import { showToast } from 'vant';
import { onMounted, ref } from 'vue';
import { useRoute } from "vue-router";
import myAxios from '../plugins/myAxios';
import qs from 'qs';
import UserCardList from '../components/UserCardList.vue';

const route = useRoute();
const { tags } = route.query;

const userList = ref([]);

onMounted(async() => {
    const userListData = await myAxios.get('/user/recommend', {
      params: {},
      paramsSerializer: params => {
        return qs.stringify(params,{indices: false});
      },
    })
    .then(function (response) {
        console.log('/user/recommend success', response);
        showToast({ type: 'success', message: '请求成功' });
        return response?.data;
      })
    .catch(function (error) {
        console.error('/user/recommend error', error);
        showToast({ type: 'fail', message: '请求失败' });
      })
    if(userListData){
      userListData.forEach(user => {
        if(user.tags){
          user.tags = JSON.parse(user.tags);
        }
      })
      userList.value = userListData;
    }
});
</script>

<style scoped>
</style>