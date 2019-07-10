/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Createobjectaction of the Data Model uml.
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
{@link classifier}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getClassifier},
{@link getResult},
{@link setClassifier},
{@link setResult},
 */

@Description("A CreateObjectAction is an Action that creates an instance of the specified Classifier.<p>From package UML::Actions.</p>")

public interface Createobjectaction extends GenericEntity, uml.Action {

	EntityType<Createobjectaction> T = EntityTypes.T(Createobjectaction.class);

	/* Constants for each property name. */
	java.lang.String classifier = "classifier";
	java.lang.String result = "result";

	@Description("The Classifier to be instantiated.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Classifier getClassifier();
	void setClassifier(uml.Classifier classifier);
	@Description("The OutputPin on which the newly created object is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
