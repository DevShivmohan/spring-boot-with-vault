# spring-boot-with-vault

 -  To configure the HashiCorp vault [click here for vault config demo video](https://drive.google.com/file/d/13YSA6J9TpXaAghP_UYAO1YZ1atlISK60/view?usp=sharing).
 -  Data for this project in the below screenshot.
 -  ![image](https://github.com/DevShivmohan/spring-boot-with-vault/assets/72655528/bebf552b-6ed1-4481-8acc-f472b865a173)
 -  To start the vault server with specific token id.
 -  ![image](https://github.com/DevShivmohan/spring-boot-with-vault/assets/72655528/f2133295-eece-49db-bccb-e2be8da82157).
 -  After vault server starts then need to export the address - type in terminal `export VAULT_ADDR='http://127.0.0.1:8200'`.
 -  Putting the values in different-different paths as you can see in below screenshot **secret/gs-vault-config/cloud** and **secret/gs-vault-config** while accessing the values from vault need to specify these paths inside application name.
 -  ![image](https://github.com/DevShivmohan/spring-boot-with-vault/assets/72655528/2215be14-e624-489f-903b-5a817bba670c).
 -  Accessing the values from vault using itself.
 -  ![image](https://github.com/DevShivmohan/spring-boot-with-vault/assets/72655528/372350a7-fa2a-49b0-8117-7454a1679fef).
 -  Done.


