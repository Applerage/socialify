import { createRouter, createWebHistory } from 'vue-router'
import LoginPage from '../views/LoginPage.vue'
import HomePage from '../views/HomePage.vue'
import DefaultLayout from '../layouts/DefaultLayout.vue'

const routes = [
    {
        path: '/',
        redirect: '/login',
        component: DefaultLayout,
        children: [
            {
                path: '/login',
                name: 'LoginPage',
                component: LoginPage
            }
        ]

    },
    {
        path: '/home',
        component: DefaultLayout,
        children: [
            {
                path:'/home',
                name:'HomePage',
                component: HomePage
            }
        ]
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
export default router