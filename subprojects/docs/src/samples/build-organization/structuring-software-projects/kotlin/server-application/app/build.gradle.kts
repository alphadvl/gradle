plugins {
    id("com.myorg.spring-boot-application")
}

group = "${group}.server-application"

dependencies {
    implementation("com.myorg.myproduct.user-component:table")
    implementation("com.myorg.myproduct.admin-component:config")

    implementation("org.apache.juneau:juneau-marshall")
}
