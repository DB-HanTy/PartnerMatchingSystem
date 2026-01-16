import { createApp } from 'vue'
import App from './App.vue'
import { NavBar } from 'vant';

const app = createApp(App).mount('#app')
app.use(NavBar);