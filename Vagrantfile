Vagrant.configure("2") do |config|
  config.vm.provider "virtualbox" do |vb|
  config.vm.box = "centos/7"
  config.vm.hostname = "ci-server"
  vb.memory = "2048"
  config.vm.network "public_network"
  config.vm.provision "shell", inline: "sudo yum update -y"
  config.vm.provision "shell", inline: "sudo yum install java-1.8.0-openjdk.x86_64 -y"
  config.vm.provision "shell", inline: "sudo cp /etc/profile /etc/profile_backup"
  config.vm.provision "shell", inline: "echo 'export JAVA_HOME=/usr/lib/jvm/jre-1.8.0-openjdk' | sudo tee -a /etc/profile"
  config.vm.provision "shell", inline: "echo 'export JRE_HOME=/usr/lib/jvm/jre' | sudo tee -a /etc/profile"
  config.vm.provision "shell", inline: "source /etc/profile"
  config.vm.provision "shell", inline: "cd ~"
  config.vm.provision "shell", inline: "yum install wget -y"
  config.vm.provision "shell", inline: "sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo"
  config.vm.provision "shell", inline: "sudo rpm --import http://pkg.jenkins-ci.org/redhat-stable/jenkins-ci.org.key"
  config.vm.provision "shell", inline: "sudo yum install jenkins -y"
  config.vm.provision "shell", inline: "sudo systemctl restart jenkins.service"
  config.vm.provision "shell", inline: "sudo systemctl enable jenkins.service"
  end
end
