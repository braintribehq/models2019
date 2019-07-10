/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Behavior of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link specification}, 
{@link context}, 
{@link isReentrant}, 
{@link ownedParameter}, 
{@link ownedParameterSet}, 
{@link postcondition}, 
{@link precondition}, 
{@link redefinedBehavior}, 

* It provides of then following operations (getters and setters)
{@link getSpecification},
{@link getContext},
{@link getIsReentrant},
{@link getOwnedParameter},
{@link getOwnedParameterSet},
{@link getPostcondition},
{@link getPrecondition},
{@link getRedefinedBehavior},
{@link setSpecification},
{@link setContext},
{@link setIsReentrant},
{@link setOwnedParameter},
{@link setOwnedParameterSet},
{@link setPostcondition},
{@link setPrecondition},
{@link setRedefinedBehavior},
 */

@Description("Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution.<p>From package UML::CommonBehavior.</p>")
 
@Abstract 

public interface Behavior extends GenericEntity, uml.Class {

	EntityType<Behavior> T = EntityTypes.T(Behavior.class);

	/* Constants for each property name. */
	java.lang.String specification = "specification";
	java.lang.String context = "context";
	java.lang.String isReentrant = "isReentrant";
	java.lang.String ownedParameter = "ownedParameter";
	java.lang.String ownedParameterSet = "ownedParameterSet";
	java.lang.String postcondition = "postcondition";
	java.lang.String precondition = "precondition";
	java.lang.String redefinedBehavior = "redefinedBehavior";

	@Description("Designates a BehavioralFeature that the Behavior implements. The BehavioralFeature must be owned by the BehavioredClassifier that owns the Behavior or be inherited by it. The Parameters of the BehavioralFeature and the implementing Behavior must match. A Behavior does not need to have a specification, in which case it either is the classifierBehavior of a BehavioredClassifier or it can only be invoked by another Behavior of the Classifier.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Behavioralfeature getSpecification();
	void setSpecification(uml.Behavioralfeature specification);
	@Description("The BehavioredClassifier that is the context for the execution of the Behavior. A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior. For example, following this algorithm, the context of an entry Behavior in a StateMachine is the BehavioredClassifier that owns the StateMachine. The features of the context BehavioredClassifier as well as the Elements visible to the context Classifier are visible to the Behavior.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Behavioredclassifier getContext();
	void setContext(uml.Behavioredclassifier context);
	@Description("Tells whether the Behavior can be invoked while it is still executing from a previous invocation.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	types.Boolean getIsReentrant();
	void setIsReentrant(types.Boolean isReentrant);
	@Description("References a list of Parameters to the Behavior which describes the order and type of arguments that can be given when the Behavior is invoked and of the values which will be returned when the Behavior completes its execution.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Parameter> getOwnedParameter();
	void setOwnedParameter(java.util.List<uml.Parameter> ownedParameter);

	@Description("The ParameterSets owned by this Behavior.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Parameterset> getOwnedParameterSet();
	void setOwnedParameterSet(java.util.List<uml.Parameterset> ownedParameterSet);

	@Description("An optional set of Constraints specifying what is fulfilled after the execution of the Behavior is completed, if its precondition was fulfilled before its invocation.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Constraint> getPostcondition();
	void setPostcondition(java.util.List<uml.Constraint> postcondition);

	@Description("An optional set of Constraints specifying what must be fulfilled before the Behavior is invoked.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Constraint> getPrecondition();
	void setPrecondition(java.util.List<uml.Constraint> precondition);

	@Description("References the Behavior that this Behavior redefines. A subtype of Behavior may redefine any other subtype of Behavior. If the Behavior implements a BehavioralFeature, it replaces the redefined Behavior. If the Behavior is a classifierBehavior, it extends the redefined Behavior.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Behavior> getRedefinedBehavior();
	void setRedefinedBehavior(java.util.List<uml.Behavior> redefinedBehavior);

}
