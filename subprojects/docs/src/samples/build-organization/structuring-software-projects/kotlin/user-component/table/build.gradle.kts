plugins {
    id("com.myorg.java-library")
}

group = "${group}.user-component"

dependencies {
    implementation(project(":data"))

    implementation("com.myorg.myproduct.state:application-state")
}
