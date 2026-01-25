<template>
  <van-card
  v-for="user in userList"
  :desc="user.profile"
  :title="`${user.username} (${user.userCode})`"
  :thumb="user.avatarUrl"

>
  <template #tags>
    <van-tag plain type="primary" v-for="tag in user.tags" style="margin-right: 8px;">{{ tag }}</van-tag>
  </template>
  <template #footer>
    <van-button size="mini">联系我</van-button>
  </template>
</van-card>
<div>
  <van-empty v-if="!userList || userList.length < 1" description="搜索结果为空" />
</div>
</template>
<script setup>
import { showToast } from 'vant';
import { onMounted, ref } from 'vue';
import { useRoute } from "vue-router";
import myAxios from '../plugins/myAxios';
import qs from 'qs';

const route = useRoute();
const { tags } = route.query;

const userList = ref([]);

onMounted(async() => {
    const userListData = await myAxios.get('/user/search/tags', {
      params: {
        tagNameList: tags,
      },
      paramsSerializer: params => {
        return qs.stringify(params,{indices: false});
      },
    })
    .then(function (response) {
        console.log('/user/search/tags success', response);
        showToast({ type: 'success', message: '请求成功' });
        return response.data?.data;
      })
    .catch(function (error) {
        console.error('/user/search/tags error', error);
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