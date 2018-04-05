package br.uol.pagseguro.client.pagcafe.task;

import br.uol.pagseguro.client.pagcafe.model.Transaction;


public interface TransactionSuccessCallback {

    /**
     * Called when the transaction task has finished successfully.
     *
     * @param result Results generated by the transaction.
     */
    void onSuccess(Transaction result);

}