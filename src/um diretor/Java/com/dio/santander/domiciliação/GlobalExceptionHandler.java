pacote  com . dio . santander . exceções ;
importar  java . útil . Data ;

importar  org . springframework . http . HttpStatus ;
importar  org . springframework . http . ResponseEntidade ;
importar  org . springframework . web . ligar . anotação . ControllerAdvice ;
importar  org . springframework . web . ligar . anotação . ExceptionHandler ;
importar  org . springframework . web . contexto . pedido . WebRequest ;

@ ControllerAdvice
 classe  pública GlobalExceptionHandler {
    @ ExceptionHandler ( ResourceNotFoundException . class )
    public  ResponseEntity <?> resourceNotFoundException ( ResourceNotFoundException  ex , solicitação WebRequest  ) {
         ErrorDetails  errorDetails = new  ErrorDetails ( new  Date (), ex . getMessage (), request . getDescription ( false ));
         return  new  ResponseEntity <>( errorDetails , HttpStatus . NOT_FOUND );
    }

    @ ExceptionHandler ( Exception . class )
    public  ResponseEntity <?> globleExcpetionHandler ( Exceção  ex , solicitação WebRequest  ) {
        ErrorDetails  errorDetails = new  ErrorDetails ( new  Date (), ex . getMessage (), request . getDescription ( false ));
        return  new  ResponseEntity <>( errorDetails , HttpStatus . INTERNAL_SERVER_ERROR );
    }
}
