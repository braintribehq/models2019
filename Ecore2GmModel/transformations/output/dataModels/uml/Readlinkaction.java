/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Readlinkaction of the Data Model uml.
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
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getResult},
{@link setResult},
 */

@Description("A ReadLinkAction is a LinkAction that navigates across an Association to retrieve the objects on one end.<p>From package UML::Actions.</p>")

public interface Readlinkaction extends GenericEntity, uml.Linkaction {

	EntityType<Readlinkaction> T = EntityTypes.T(Readlinkaction.class);

	/* Constants for each property name. */
	java.lang.String result = "result";

	@Description("The OutputPin on which the objects retrieved from the 'open' end of those links whose values on other ends are given by the endData.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
