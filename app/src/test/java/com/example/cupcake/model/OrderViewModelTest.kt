package com.example.cupcake.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test


/**
 * Created by Clarence E Moore on 2022-11-28.
 *
 * Description:
 *
 *
 */
class OrderViewModelTest {
    private lateinit var viewModel: OrderViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        viewModel = OrderViewModel()
    }

    @Test
    fun testSetQuantity() {
        // Given
        /**
         * for this example we dont need to do anything because this is the first thing to happen
         */

        // When
        viewModel.quantity.observeForever {}
        viewModel.setQuantity(12)

        // Then
        assert(viewModel.quantity.value == 12)
    }

    @Test
    fun price_twelve_cupcake() {
        viewModel.price.observeForever {}
        viewModel.setQuantity(12)
        assert(viewModel.price.value == "$27.00")
    }
}
