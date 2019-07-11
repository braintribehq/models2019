/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDirection of the Data Model iai.
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
{@link DirectionRatios}, 
{@link DirectionRatiosAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getDirectionRatios},
{@link getDirectionRatiosAsString},
{@link getDim},
{@link setDirectionRatios},
{@link setDirectionRatiosAsString},
{@link setDim},
 */

@Description("")

public interface IfcDirection extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcGridPlacementDirectionSelect, ifc4.IfcVectorOrDirection {

	EntityType<IfcDirection> T = EntityTypes.T(IfcDirection.class);

	/* Constants for each property name. */
	java.lang.String DirectionRatios = "DirectionRatios";
	java.lang.String DirectionRatiosAsString = "DirectionRatiosAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	
	java.util.List<java.lang.Double> getDirectionRatios();
	void setDirectionRatios(java.util.List<java.lang.Double> DirectionRatios);

	@Description("")
	
	java.util.List<java.lang.String> getDirectionRatiosAsString();
	void setDirectionRatiosAsString(java.util.List<java.lang.String> DirectionRatiosAsString);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
