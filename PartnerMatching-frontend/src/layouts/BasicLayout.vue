<template>
    <van-nav-bar
  title="标题"
  left-arrow
  @click-left="onClickLeft"
  @click-right="onClickRight"
>
<template #right>
    <van-icon name="search" size="18" />
  </template>
</van-nav-bar>

</template>

<script setup>
    const onClickLeft = () => alert('左');
    const onClickRight = () => alert('右');

</script>

<style scoped>

</style>