[when]There is an Instance with field of "{value}"=i: Instance(field=="{value}")
[when]Instance is at least {number} and field is "{value}"=i: Instance(number > {number}, location=="{value}")
[then]Log : "{message}"=System.out.println("{message}");
[then]Set field of instance to "{value}"=i.setField("{value}");
[then]Create instance : "{value}"=insert(new Instance("{value}"));
[when]There is no current Instance with field : "{value}"=not Instance(field == "{value}")
[then]Report error : "{error}"=System.err.println("{error}");
[then]Retract the fact : '{variable}'=retract({variable}); //this would retract bound variable {variable}
[when]There is an order=order : Order (  )
[when]Retrieve the order line items=item : OrderProduct ( itemCnt : cnt, stdPrice == 0 ) from order.getLines();
[then]Print out the line item's price=System.out.println(partyType + " Customer LineItem: " + item.productId + " Price $" + price);
[then]Calculate then item's price=item.setStdPrice(price * itemCnt);
[then]Update the order=update(order);
[then]Apply line item discount of {x} to previously calculated price=item.setQntDiscountPrice(price * (1f-{x}f));
[when]Get the LIST prices of the products=ProductPrice ( price : price, productId == item.productId, priceType == ProductPrice.LIST_PRICE);
[when]Get the DISCOUNT prices of the products=ProductPrice ( price : price, productId == item.productId, priceType == ProductPrice.DISCOUNT_PRICE);
[when]The customer is a GOLD customer=party : Party ( partyId == order.partyId, partyType : partyTypeId == Party.GOLD  ); 
[when]The customer is a SILVER customer=party : Party ( partyId == order.partyId, partyType :  partyTypeId == Party.SILVER  ); 
[when]The customer is a REGULAR customer=party : Party ( partyId == order.partyId, partyType : partyTypeId == Party.REGULAR  ); 
[when]Retrieve calculated order items which exceed a quantity of {x}=item : OrderProduct ( qntDiscountPrice == 0, price : stdPrice, cnt >= {x}, stdPrice > 0 ) from order.getLines();
[when]Calculate total price from line items=totalPrice : Float() from accumulate ( OrderProduct ( disprice : qntDiscountPrice, stdprice :  stdPrice > 0 ) from order.getLines(),init ( float total = 0; ),action ( total += (disprice > 0 ? disprice : stdprice); ),result ( new Float(total) ) );
[then]Save the total price into memory=TotalPrice tot = new TotalPrice();tot.setTotalPrice(totalPrice);tot.setOrderId(order.getOrderId());insert (tot);
[then]Print out total price=System.out.println("Final price: " + totalPrice);