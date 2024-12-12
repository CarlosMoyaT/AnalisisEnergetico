# AnalisisEnergetico

Este proyecto es una API RESTful desarrollada con Spring Boot que permite gestionar y consultar datos de consumo energético de diferentes usuarios. Ofrece varios endpoints para acceder y filtrar la información, he tratado de usar programación funcional a modo de aprender sobre ésta ya que me parece interesante. Las tecnologías que he usado son:

- Spring Boot
- Spring Data JPA
- H2 Database 

la API permite filtrar los consumos por tipo de usuario (residencial, industrial, etc...) y por un umbral minimo de consumo en KWh.
Los endpoints que he probado son:
- localhost:8080/consumo/consumo/todos
- localhost:8080/consumo/tipo/residencial
- localhost:8080/consumo/minimo/100
- localhost:8080/consumo/total

  
