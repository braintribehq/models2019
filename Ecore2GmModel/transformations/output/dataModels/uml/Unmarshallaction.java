/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Unmarshallaction of the Data Model uml.
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
{@link object}, 
{@link result}, 
{@link unmarshallType}, 

* It provides of then following operations (getters and setters)
{@link getObject},
{@link getResult},
{@link getUnmarshallType},
{@link setObject},
{@link setResult},
{@link setUnmarshallType},
 */

@Description("An UnmarshallAction is an Action that retrieves the values of the StructuralFeatures of an object and places them on OutputPins.<p>From package UML::Actions.</p>")

public interface Unmarshallaction extends GenericEntity, uml.Action {

	EntityType<Unmarshallaction> T = EntityTypes.T(Unmarshallaction.class);

	/* Constants for each property name. */
	java.lang.String object = "object";
	java.lang.String result = "result";
	java.lang.String unmarshallType = "unmarshallType";

	@Description("The InputPin that gives the object to be unmarshalled.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("The OutputPins on which are placed the values of the StructuralFeatures of the input object.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getResult();
	void setResult(java.util.List<uml.Outputpin> result);

	@Description("The type of the object to be unmarshalled.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Classifier getUnmarshallType();
	void setUnmarshallType(uml.Classifier unmarshallType);
}
