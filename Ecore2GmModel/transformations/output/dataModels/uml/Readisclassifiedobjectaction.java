/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Readisclassifiedobjectaction of the Data Model uml.
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
{@link isDirect}, 
{@link object}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getClassifier},
{@link getIsDirect},
{@link getObject},
{@link getResult},
{@link setClassifier},
{@link setIsDirect},
{@link setObject},
{@link setResult},
 */

@Description("A ReadIsClassifiedObjectAction is an Action that determines whether an object is classified by a given Classifier.<p>From package UML::Actions.</p>")

public interface Readisclassifiedobjectaction extends GenericEntity, uml.Action {

	EntityType<Readisclassifiedobjectaction> T = EntityTypes.T(Readisclassifiedobjectaction.class);

	/* Constants for each property name. */
	java.lang.String classifier = "classifier";
	java.lang.String isDirect = "isDirect";
	java.lang.String object = "object";
	java.lang.String result = "result";

	@Description("The Classifier against which the classification of the input object is tested.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Classifier getClassifier();
	void setClassifier(uml.Classifier classifier);
	@Description("Indicates whether the input object must be directly classified by the given Classifier or whether it may also be an instance of a specialization of the given Classifier.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsDirect();
	void setIsDirect(types.Boolean isDirect);
	@Description("The InputPin that holds the object whose classification is to be tested.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("The OutputPin that holds the Boolean result of the test.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
