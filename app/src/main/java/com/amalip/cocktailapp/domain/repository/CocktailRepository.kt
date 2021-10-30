package com.amalip.cocktailapp.domain.repository

import com.amalip.cocktailapp.core.exception.Failure
import com.amalip.cocktailapp.core.functional.Either
import com.amalip.cocktailapp.data.dto.CocktailsResponse

interface CocktailRepository {

    fun getCocktailsByName(name: String): Either<Failure, CocktailsResponse>

}