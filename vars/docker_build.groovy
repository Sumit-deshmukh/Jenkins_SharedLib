// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser, String sudoPassword){
   " echo ${sudoPassword} | sudo -S docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
