package org.itmo.lesson9.generics;

public abstract class DocumentService<RequestData, Report> {
    abstract Report calculate(RequestData requestData);

    public void getCalculationTime(RequestData requestData) {
        calculate(requestData);
    }
}
