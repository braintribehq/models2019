/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Readextentaction of the Data Model uml.
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

@Description("A ReadExtentAction is an Action that retrieves the current instances of a Classifier.<p>From package UML::Actions.</p>")

public interface Readextentaction extends GenericEntity, uml.Action {

	EntityType<Readextentaction> T = EntityTypes.T(Readextentaction.class);

	/* Constants for each property name. */
	java.lang.String classifier = "classifier";
	java.lang.String result = "result";

	@Description("The Classifier whose instances are to be retrieved.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Classifier getClassifier();
	void setClassifier(uml.Classifier classifier);
	@Description("The OutputPin on which the Classifier instances are placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
