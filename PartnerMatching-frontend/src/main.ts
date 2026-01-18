import { compile, createApp } from 'vue'
import App from './App.vue'
import * as VueRouter from 'vue-router'
import routes from './config/route'

const router = VueRouter.createRouter({
    history: VueRouter.createWebHistory(),
    routes
})

createApp(App).use(router).mount('#app')





