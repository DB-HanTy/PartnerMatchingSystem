<template>
<van-cell title="用户名" is-link to="/user/edit" :value="user.username"/>
<van-cell title="账号" :value="user.userAccount" />
<van-cell title="头像" is-link to="/user/edit" >
    <img style="height: 48px;" :src="user.avatarUrl" />
</van-cell>
<van-cell title="性别" :value="user.gender" @click="toEdit('gender','性别',user.gender)"/>
<van-cell title="电话" is-link to="/user/edit" :value="user.phone" @click="toEdit('phone','电话',user.phone)"/>
<van-cell title="邮箱" is-link to="/user/edit" :value="user.email" />
<van-cell title="用户编号" :value="user.userCode" />
<van-cell title="注册时间" :value="user.createTime.toISOString()" />
</template>
<script setup lang="ts">
import { showToast } from 'vant';
import { onMounted, ref } from 'vue';
import { useRouter } from "vue-router";
import myAxios from '../plugins/myAxios';
import qs from 'qs';
const user = {
    id: 1,
    username: 'hty',
    userAccount: 'hhty',
    avatarUrl: 'https://platypusbucket.oss-cn-shanghai.aliyuncs.com/600x600bb.jpg',
    gender: '男',
    phone: '123123',
    email: '1231232',
    userCode: '01',
    createTime: new Date(),
}

const router = useRouter();

const userList = ref([]);

onMounted(async() => {
    const userListData = await myAxios.get('/user/search/tags', {
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

const toEdit = (editKey: string, editName: string , currentValue: string) => {
 router.push({
    path: '/user/edit',
    query: {
        editKey,
        editName,
        currentValue,
    }

 })
}
</script>

<style scoped>
</style>