plugins {
    id("com.myorg.kotlin-library")
}

group = "${group}.admin-component"

dependencies {
    implementation("com.myorg.myproduct.state:application-state")
}
