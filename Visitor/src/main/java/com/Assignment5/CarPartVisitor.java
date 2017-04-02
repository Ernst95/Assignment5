package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public interface CarPartVisitor
{
    public void visit(Car computer);

    public void visit(Engine engine);

    public void visit(Chassis chassis);

    public void visit(Interior interior);
}
