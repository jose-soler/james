/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zanox.james.rest;

import com.zanox.james.exceptions.UnacceptedAnswerException;
import com.zanox.james.exceptions.UnexistentQuestionException;

/**
 *
 * @author jose.soler
 */
public interface JamesService {

    String getAnswerSummaryForQuestionId(String questionId) throws UnexistentQuestionException;

    String getQuestion(String questionId) throws UnexistentQuestionException;

    String setAnswer(String questionId, String answer) throws UnacceptedAnswerException, UnexistentQuestionException;
    
}