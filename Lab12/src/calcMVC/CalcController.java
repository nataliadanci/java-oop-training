package calcMVC;// CalcController.java - Controller
//    Handles user interaction with listeners.
//    Calls View and Model as needed.
// Fred Swartz -- December 2004

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
    //... The Controller needs to interact with both the Model and View.
    private CalcModel m_model;
    private CalcView  m_view;
    
    //========================================================== constructor
    /** Constructor */
    CalcController(CalcModel model, CalcView view) {
        m_model = model;
        m_view  = view;
        
        //... Add listeners to the view.
        view.addMultiplyListener(new MultiplyListener());

        //we shouldn't have access to details from m_view, such as defined components (ex: multiplyBtn) because
        //they are the responsibilities of the view. But we can add another layer of abstraction, which is
        //a method in m_view which can add the action listener
        //m_view.multiplyBtn.addActionListener(new MultiplyListener());

        view.addMultiplyClearListener(new ClearMultiplyListener());
        view.addSubtractListener(new SubtractListener());
        view.addSubtractClearListener(new ClearSubtractListener());
        view.addClearAllListener(new ClearAllListener());
    }
    
    
    ////////////////////////////////////////// inner class MultiplyListener
    /** When a mulitplication is requested.
     *  1. Get the user input number from the View.
     *  2. Call the model to mulitply by this number.
     *  3. Get the result from the Model.
     *  4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = m_view.getMultiplyUserInput();
                m_model.multiplyBy(userInput);
                m_view.setMultiplyTotal(m_model.getMultiplyTotal());
                
            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput + "'");
            }
        }
    }//end inner class MultiplyListener

    class SubtractListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String userInput = "";
            try{
                userInput = m_view.getSubtractUserInput();
                m_model.subtract(userInput);
                m_view.setSubtractTotal(m_model.getSubtractTotal());
            }
            catch (NumberFormatException exception){
                m_view.showError("Bad input: '" + userInput + "'");
            }

        }
    }
    
    
    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */    
    class ClearMultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.resetMultiply();
            m_view.resetMultiplyResult();
        }
    }// end inner class ClearMultiplyListener

    class ClearSubtractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.resetSubtract();
            m_view.resetSubtractResult();
        }
    }

    class ClearAllListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.resetAll();
            m_view.resetAllResults();
        }
    }
}
