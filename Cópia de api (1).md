# Exemplos de requisições e respostas

## Cadastro
```sh
$ curl --request POST \
  --url https://dev.people.com.ai/mobile/api/v2/register \
  --header 'content-type: application/json' \
  --data '{
	"email":"igor@email.com",
	"name":"Igor Silva",
	"password":"Senha@12346"
}'
```

## Login
```sh
$ curl --request POST \
  --url https://dev.people.com.ai/mobile/api/v2/login \
  --header 'content-type: application/json' \
  --data '{
	"email":"igor@email.com",
	"password":"Senha@12346"
}'
```

## Logo
Troque `{nomedosite.com}` pelo nome do site que deseja buscar a logo
O valor do header `authorization` corresponde o valor `token` retornado pelas apis de cadastro e login
```sh
$ curl --request GET \
  --url https://dev.people.com.ai/mobile/api/v2/logo/{nomedosite.com} \
  --header 'authorization: c6da7b6a-0848-45f2-b646-a8c7615e2d65'
 ```
