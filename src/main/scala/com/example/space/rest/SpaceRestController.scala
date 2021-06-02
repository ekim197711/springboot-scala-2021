package com.example.space.rest

import com.example.space.SpaceShip
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/space"))
class SpaceRestController {

  @GetMapping(path = Array("/ship"))
  def myship(): SpaceShip = {
    SpaceShip("Mona", 88)
  }

}
