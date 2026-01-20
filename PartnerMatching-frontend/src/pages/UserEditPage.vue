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
import { ref } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute();
const editUser = ref({
    editKey: route.query.editKey,
    currentvalue: route.query.currentValue,
    editName: route.query.editName
})

const onSubmit = (values) => {
      //todo: 提交数据
      console.log('onSubmit',values);
    };
console.log(route.query)
</script>

<style scoped>
</style>