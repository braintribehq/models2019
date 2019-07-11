/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCoordinateOperation of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link SourceCRS}, 
{@link TargetCRS}, 

* It provides of then following operations (getters and setters)
{@link getSourceCRS},
{@link getTargetCRS},
{@link setSourceCRS},
{@link setTargetCRS},
 */

@Description("")

public interface IfcCoordinateOperation extends GenericEntity {

	EntityType<IfcCoordinateOperation> T = EntityTypes.T(IfcCoordinateOperation.class);

	/* Constants for each property name. */
	java.lang.String SourceCRS = "SourceCRS";
	java.lang.String TargetCRS = "TargetCRS";

	@Description("")
	@Mandatory
	ifc4.IfcCoordinateReferenceSystemSelect getSourceCRS();
	void setSourceCRS(ifc4.IfcCoordinateReferenceSystemSelect SourceCRS);
	@Description("")
	@Mandatory
	ifc4.IfcCoordinateReferenceSystem getTargetCRS();
	void setTargetCRS(ifc4.IfcCoordinateReferenceSystem TargetCRS);
}
