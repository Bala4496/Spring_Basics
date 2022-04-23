package ua.bala.spring_mvc.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        endOfEmail = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(endOfEmail);
    }
}
