## Servicio de categorias

### Get-Categories
1. **Buscar todas las categorías**
    * Endpoint: <kbd>localhost:8080/api/v1/categories</kbd>
    * Http method: <kbd>GET</kbd>
    * Request: -
    * Response:
      ```json
      {
        "categoryResponse": {
        "categories": [
            {
            "id": 1,
            "name": "Lacteos",
            "description": "Productos derivados de la leche"
            },
            {
              "id": 2,
              "name": "No perecibles",
              "description": "Productos que no vencen o perecen"
            }
          ]
        },
        "metadata": [
            {
              "date": "Respuesta exitosa",
              "code": "00",
              "type": "Respuesta ok"
            }
          ]
        }
      ```
### Get-Categories by id
2. **Buscar las categorías por id**
    * Endpoint: <kbd>localhost:8080/api/v1/categories/{id}</kbd>
    * Http method: <kbd>GET</kbd>
    * Request: -
    * Response:
      ```json
      {
        "categoryResponse": {
        "categories": [
            {
            "id": 1,
            "name": "Lacteos",
            "description": "Productos derivados de la leche"
            }
          ]
        },
        "metadata": [
            {
              "date": "Categoria encontrada",
              "code": "00",
              "type": "Respuesta ok"
            }
          ]
        }
      ```
### Save-Categories
   3. **Guarda categorías**
       * Endpoint: <kbd>localhost:8080/api/v1/categories</kbd>
       * Http method: <kbd>POST</kbd>
       * Request:
         ```json
         {
           "name": "No perecibles",
           "description": "Productos que no vencen o perecen"
         }
         ```
       * Response:
         ```json
         {
           "categoryResponse": {
           "categories": [
               {
                "id": 2,
                "name": "No perecibles",
                "description": "Productos que no vencen o perecen"
               }
              ]
             },
             "metadata": [
               {
                "date": "Respuesta exitosa",
                "code": "00",
                "type": "Respuesta ok"
               }
            ]
         }
         ```
### Update-Categories by Id
4. **Actualiza categorías por Id**
    * Endpoint: <kbd>localhost:8080/api/v1/categories/{id}</kbd>
    * Http method: <kbd>PUT</kbd>
    * Request:
      ```json
      {
        "name": "No perecibles",
        "description": "Productos como quesos, yogurt, leche, etc."
      }
      ```
    * Response:
      ```json
      {
        "categoryResponse": {
        "categories": [
            {
             "id": 2,
             "name": "No perecibles",
             "description": "Productos como quesos, yogurt, leche, etc."
            }
           ]
          },
          "metadata": [
            {
             "date": "Categoría actualizada",
             "code": "00",
             "type": "Respuesta ok"
            }
         ]
      }
      ```
### Delete-Categories by Id
5. **Elimina categorías por Id**
    * Endpoint: <kbd>localhost:8080/api/v1/categories/{id}</kbd>
    * Http method: <kbd>DELETE</kbd>
    * Request: -  
    * Response:
      ```json
      {
        "categoryResponse": {
          "category": null                        
        },
        "metadata": [
          {
           "date": "Registro eliminado",
           "code": "00",
           "type": "Respuesta ok"
          }
        ]
      }
      ```