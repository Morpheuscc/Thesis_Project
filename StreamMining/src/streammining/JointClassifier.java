/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streammining;

import moa.classifiers.AbstractClassifier;
import moa.classifiers.core.attributeclassobservers.AttributeClassObserver;
import moa.core.AutoExpandVector;
import moa.core.DoubleVector;
import moa.core.Measurement;
import weka.core.Instance;
/**
 *
 * @author Christopher
 */
public class JointClassifier extends AbstractClassifier {
    
    private static final long serialVersionUID = 1L;
    
    protected DoubleVector observedClassDistribution;
    
    protected AutoExpandVector<AttributeClassObserver> attributeObservers;
    
    @Override
    public boolean isRandomizable(){
        return false;
    }
    
    @Override
    public void resetLearningImpl(){ //Update this for presetting learning conditions
        this.observedClassDistribution = new DoubleVector();
    }

    @Override
    public void getModelDescription(StringBuilder out, int ident){
        
    }
    
    @Override
   protected Measurement[] getModelMeasurementsImpl(){
        return null;
    }
    
    @Override
    public void trainOnInstanceImpl(Instance inst){ //Code for 
        //Obversvation here
    }
    
    @Override
    public double[] getVotesForInstance(Instance inst) {
        return this.observedClassDistribution.getArrayCopy();
    }
}

