<template>
<van-form @submit="onSubmit">
    <van-field
      v-model="editUser.currentvalue"
      :name="editUser.editKey"
      :label="editUser.editName"
      placeholder="`请输入${editUser.editName}`"
    />
  <div style="margin: 16px;">
    <van-button round block type="primary" native-type="submit">
      提交
    </van-button>
  </div>
</van-form>
</template>
<script setup lang="ts">
import {  ref } from 'vue';
import { useRoute,useRouter } from 'vue-router';
import myAxios from '../plugins/myAxios';
import { showToast } from 'vant';
import { getCurrentUser } from '../services/user';

const route = useRoute();
const router = useRouter();
const editUser = ref({
    editKey: route.query.editKey,
    currentvalue: route.query.currentValue,
    editName: route.query.editName
})

const onSubmit = async () => {
  const currentUser = await getCurrentUser();
  
  if(!currentUser){
    showToast({ type: 'fail', message: '请先登录' });
    return}

  const res =  await myAxios.post('/user/update',{
    'id': currentUser.id,
  [editUser.value.editKey]: editUser.value.currentvalue,
  })
  console.log(res,'更新请求');
  if(res.code === 0 && res.data > 0){
    showToast({ type: 'success', message: '修改成功' });
    router.back();
  }else{
    showToast({ type: 'fail', message: '修改错误' });
  }
};
</script>

<style scoped>
</style>