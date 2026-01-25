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

</template>
<script setup>
import { ref } from 'vue';
import { useRoute, useRouter } from "vue-router";

const route = useRoute();

const { tags } = route.query;

const mockUser = {
    id: '12345',
    username: 'hty',
    userAccount: '123',
    avatarUrl: 'https://platypusbucket.oss-cn-shanghai.aliyuncs.com/600x600bb.jpg',
    profile: 'hty的个人简介',
    gender: 0,
    phone: '123123123',
    email: '123',
    userRole: 0,
    userCode: '1234',
    createTime: new Date,
    tags: ['java','emo']
}

const userList = ref([mockUser]);


</script>

<style scoped>
</style>