Vagrant.configure("2") do |ci_server|

      ci_server.vm.define :ci_server do |ci_server|
      ci_server.vm.provider "virtualbox" do |vb|
      ci_server.vm.box = "centos/7"
      ci_server.vm.hostname = "ciserver"
      vb.memory = "2048"
      ci_server.vm.network :private_network, ip: "10.0.15.10"
      ci_server.vm.provision "shell", inline: "sudo yum update -y"
      ci_server.vm.provision "shell", inline: "sudo yum install java-1.8.0-openjdk.x86_64 -y"
      ci_server.vm.provision "shell", inline: "sudo cp /etc/profile /etc/profile_backup"
      ci_server.vm.provision "shell", inline: "echo 'export JAVA_HOME=/usr/lib/jvm/jre-1.8.0-openjdk' | sudo tee -a /etc/profile"
      ci_server.vm.provision "shell", inline: "echo 'export JRE_HOME=/usr/lib/jvm/jre' | sudo tee -a /etc/profile"
      ci_server.vm.provision "shell", inline: "source /etc/profile"
      ci_server.vm.provision "shell", inline: "cd ~"
      ci_server.vm.provision "shell", inline: "yum install wget -y"
      ci_server.vm.provision "shell", inline: "sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo"
      ci_server.vm.provision "shell", inline: "sudo rpm --import http://pkg.jenkins-ci.org/redhat-stable/jenkins-ci.org.key"
      ci_server.vm.provision "shell", inline: "sudo yum install jenkins -y"
      ci_server.vm.provision "shell", inline: "sudo systemctl restart jenkins.service"
      ci_server.vm.provision "shell", inline: "sudo systemctl enable jenkins.service"
      end
    end

    ci_server.vm.define :node1 do |node1|
       node1.vm.box = "centos/7"
       node1.vm.hostname = "node1"
       node1.vm.network :private_network, ip: "10.0.15.11"
       node1.vm.provision "shell", inline: "sudo yum update -y"
       node1.vm.provider "virtualbox" do |vb|
       vb.memory = "1024"
       end
      end

  ci_server.vm.define :web01 do |web01|
        web01.vm.box = "centos/7"
        web01.vm.hostname = "web01"
        web01.vm.network :private_network, ip: "10.0.15.12"
        web01.vm.provision "shell", inline: "sudo yum update -y"
        web01.vm.provider "virtualbox" do |vb|
        vb.memory = "1024"
        end
      end
end
