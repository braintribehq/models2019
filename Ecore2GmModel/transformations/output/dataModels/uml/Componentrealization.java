/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Componentrealization of the Data Model uml.
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
{@link realizingClassifier}, 
{@link abstraction}, 

* It provides of then following operations (getters and setters)
{@link getRealizingClassifier},
{@link getAbstraction},
{@link setRealizingClassifier},
{@link setAbstraction},
 */

@Description("Realization is specialized to (optionally) define the Classifiers that realize the contract offered by a Component in terms of its provided and required Interfaces. The Component forms an abstraction from these various Classifiers.<p>From package UML::StructuredClassifiers.</p>")

public interface Componentrealization extends GenericEntity, uml.Realization {

	EntityType<Componentrealization> T = EntityTypes.T(Componentrealization.class);

	/* Constants for each property name. */
	java.lang.String realizingClassifier = "realizingClassifier";
	java.lang.String abstraction = "abstraction";

	@Description("The Classifiers that are involved in the implementation of the Component that owns this Realization.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Classifier> getRealizingClassifier();
	void setRealizingClassifier(java.util.List<uml.Classifier> realizingClassifier);

	@Description("The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Component getAbstraction();
	void setAbstraction(uml.Component abstraction);
}
