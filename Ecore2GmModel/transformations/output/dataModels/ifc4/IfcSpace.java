/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSpace of the Data Model iai.
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
{@link PredefinedType}, 
{@link ElevationWithFlooring}, 
{@link ElevationWithFlooringAsString}, 
{@link HasCoverings}, 
{@link BoundedBy}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getElevationWithFlooring},
{@link getElevationWithFlooringAsString},
{@link getHasCoverings},
{@link getBoundedBy},
{@link setPredefinedType},
{@link setElevationWithFlooring},
{@link setElevationWithFlooringAsString},
{@link setHasCoverings},
{@link setBoundedBy},
 */

@Description("")

public interface IfcSpace extends GenericEntity, ifc4.IfcSpatialStructureElement, ifc4.IfcSpaceBoundarySelect {

	EntityType<IfcSpace> T = EntityTypes.T(IfcSpace.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String ElevationWithFlooring = "ElevationWithFlooring";
	java.lang.String ElevationWithFlooringAsString = "ElevationWithFlooringAsString";
	java.lang.String HasCoverings = "HasCoverings";
	java.lang.String BoundedBy = "BoundedBy";

	@Description("")
	@Mandatory
	ifc4.IfcSpaceTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcSpaceTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.Double getElevationWithFlooring();
	void setElevationWithFlooring(java.lang.Double ElevationWithFlooring);
	@Description("")
	@Mandatory
	java.lang.String getElevationWithFlooringAsString();
	void setElevationWithFlooringAsString(java.lang.String ElevationWithFlooringAsString);
	@Description("")
	
	java.util.List<ifc4.IfcRelCoversSpaces> getHasCoverings();
	void setHasCoverings(java.util.List<ifc4.IfcRelCoversSpaces> HasCoverings);

	@Description("")
	
	java.util.List<ifc4.IfcRelSpaceBoundary> getBoundedBy();
	void setBoundedBy(java.util.List<ifc4.IfcRelSpaceBoundary> BoundedBy);

}
