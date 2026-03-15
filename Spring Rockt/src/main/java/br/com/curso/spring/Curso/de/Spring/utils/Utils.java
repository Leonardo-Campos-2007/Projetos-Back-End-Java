package br.com.curso.spring.Curso.de.Spring.utils;

import org.springframework.beans.BeanWrapper;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.BeanWrapperImpl;


public class Utils {

    public static void copyNonNullProperties(Object source, Object target) {
        org.springframework.beans.BeanUtils.copyProperties(source, target, getNullProprertyNames(source));
    }

    public static String[] getNullProprertyNames(Object sourse) {
        final BeanWrapper src = new BeanWrapperImpl(sourse);

        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();

        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null)
                emptyNames.add(pd.getName());
        }
    }

    String[] result = new String[emptyNames.size()];
    return emptyNames.toArray(result);
}
