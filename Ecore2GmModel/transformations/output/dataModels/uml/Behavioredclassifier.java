/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Behavioredclassifier of the Data Model uml.
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
{@link classifierBehavior}, 
{@link interfaceRealization}, 
{@link ownedBehavior}, 

* It provides of then following operations (getters and setters)
{@link getClassifierBehavior},
{@link getInterfaceRealization},
{@link getOwnedBehavior},
{@link setClassifierBehavior},
{@link setInterfaceRealization},
{@link setOwnedBehavior},
 */

@Description("A BehavioredClassifier may have InterfaceRealizations, and owns a set of Behaviors one of which may specify the behavior of the BehavioredClassifier itself.<p>From package UML::SimpleClassifiers.</p>")
 
@Abstract 

public interface Behavioredclassifier extends GenericEntity, uml.Classifier {

	EntityType<Behavioredclassifier> T = EntityTypes.T(Behavioredclassifier.class);

	/* Constants for each property name. */
	java.lang.String classifierBehavior = "classifierBehavior";
	java.lang.String interfaceRealization = "interfaceRealization";
	java.lang.String ownedBehavior = "ownedBehavior";

	@Description("A Behavior that specifies the behavior of the BehavioredClassifier itself.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Behavior getClassifierBehavior();
	void setClassifierBehavior(uml.Behavior classifierBehavior);
	@Description("The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Interfacerealization> getInterfaceRealization();
	void setInterfaceRealization(java.util.List<uml.Interfacerealization> interfaceRealization);

	@Description("Behaviors owned by a BehavioredClassifier.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Behavior> getOwnedBehavior();
	void setOwnedBehavior(java.util.List<uml.Behavior> ownedBehavior);

}
