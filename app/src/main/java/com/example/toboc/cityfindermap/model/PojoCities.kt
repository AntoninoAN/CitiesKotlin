package com.example.toboc.cityfindermap.model

data class PojoCities(var country : String,
                      var name : String,
                      var _id : String,
                      var coord : PojoCoord) {
}

data class PojoCoord(var lon : Float,
                     var lat : Float) {

}
