package com.yummynoodlebar.core.services;

import com.yummynoodlebar.core.domain.Order;
import com.yummynoodlebar.core.repository.OrdersMemoryRepository;
import com.yummynoodlebar.core.events.orders.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;
import static junit.framework.TestCase.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class OrderEventHandlerUnitTest {

  OrderEventHandler uut;
  OrdersMemoryRepository mockOrdersMemoryRepository;

  @Before
  public void setupUnitUnderTest() {
    mockOrdersMemoryRepository = mock(OrdersMemoryRepository.class);
    uut = new OrderEventHandler(mockOrdersMemoryRepository);
  }

}
