# unico-webframe-webview-example-android-kotlin

Essa POC visa exemplificar a integração de uma aplicação nativa com o SDK Web, de forma que a câmera seja aberta em um WebView e após a captura, o app continuar o seu fluxo com as informações obtidas na aplicação web.

A comunicação com a web é feita pela interface: WebInterface.kt

## Adicionar as permissões no arquivo AndroidManifest.xml

<img width="523" alt="Captura de Tela 2022-12-21 às 10 40 12" src="https://user-images.githubusercontent.com/117770675/208918871-36159360-efcf-468f-ba5e-fcf2ddc9812b.png">


## Como testar

## 1- Adicione os arquivos de configuração js

os arquivos devem ser adicionados em: `web/public/`

```
web/public/services-sem-facetec.json
web/public/services.json
```

### 2- Rode o servidor web
```
cd web
yarn install
yarn start
```

### 3- Altere a url do servidor
No nativo, na class `MainActivity.kt` altere a linha 40 `loadUrl` para sua url local
