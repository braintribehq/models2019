/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Expansionnode of the Data Model uml.
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
{@link regionAsInput}, 
{@link regionAsOutput}, 

* It provides of then following operations (getters and setters)
{@link getRegionAsInput},
{@link getRegionAsOutput},
{@link setRegionAsInput},
{@link setRegionAsOutput},
 */

@Description("An ExpansionNode is an ObjectNode used to indicate a collection input or output for an ExpansionRegion. A collection input of an ExpansionRegion contains a collection that is broken into its individual elements inside the region, whose content is executed once per element. A collection output of an ExpansionRegion combines individual elements produced by the execution of the region into a collection for use outside the region.<p>From package UML::Actions.</p>")

public interface Expansionnode extends GenericEntity, uml.Objectnode {

	EntityType<Expansionnode> T = EntityTypes.T(Expansionnode.class);

	/* Constants for each property name. */
	java.lang.String regionAsInput = "regionAsInput";
	java.lang.String regionAsOutput = "regionAsOutput";

	@Description("The ExpansionRegion for which the ExpansionNode is an input.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Expansionregion getRegionAsInput();
	void setRegionAsInput(uml.Expansionregion regionAsInput);
	@Description("The ExpansionRegion for which the ExpansionNode is an output.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Expansionregion getRegionAsOutput();
	void setRegionAsOutput(uml.Expansionregion regionAsOutput);
}
