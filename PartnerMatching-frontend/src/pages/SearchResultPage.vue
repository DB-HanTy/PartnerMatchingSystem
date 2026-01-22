<template>
  {{  }}
</template>
<script setup>
import { ref } from 'vue';
import { showToast } from 'vant';
import { useRoute, useRouter } from "vue-router";

const route = useRoute();

const { tags } = route.query;

const mockUser = {
    id: '12345',
    username: 'hty',
    userAccount: '123',
    avatarUrl?: '123',
    gender: 0,
    phone: '123123123',
    email: '123',
    userRole: 0,
    usertCode: '1234',
    createTime: new Date,
    tags: ['java']
}

const userList = ref([mockUser]);


</script>

<style scoped>
</style>