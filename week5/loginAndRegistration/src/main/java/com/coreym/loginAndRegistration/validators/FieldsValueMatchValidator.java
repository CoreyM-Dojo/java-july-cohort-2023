package com.coreym.loginAndRegistration.validators;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator 
implements ConstraintValidator<FieldMatch, Object> {

  private String field;
  private String fieldMatch;

  public void initialize(FieldMatch constraintAnnotation) {
      this.field = constraintAnnotation.field();
      this.fieldMatch = constraintAnnotation.fieldMatch();
  }
  
  public boolean isValid(Object value, 
    ConstraintValidatorContext context) {

      Object fieldValue = new BeanWrapperImpl(value)
        .getPropertyValue(field);
      Object fieldMatchValue = new BeanWrapperImpl(value)
        .getPropertyValue(fieldMatch);
      
     return fieldMatch != null && fieldValue.equals(fieldMatchValue);
  }
}