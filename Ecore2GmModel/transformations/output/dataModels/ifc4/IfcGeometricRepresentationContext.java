/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcGeometricRepresentationContext of the Data Model iai.
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
{@link CoordinateSpaceDimension}, 
{@link Precision}, 
{@link PrecisionAsString}, 
{@link WorldCoordinateSystem}, 
{@link TrueNorth}, 
{@link HasSubContexts}, 
{@link HasCoordinateOperation}, 

* It provides of then following operations (getters and setters)
{@link getCoordinateSpaceDimension},
{@link getPrecision},
{@link getPrecisionAsString},
{@link getWorldCoordinateSystem},
{@link getTrueNorth},
{@link getHasSubContexts},
{@link getHasCoordinateOperation},
{@link setCoordinateSpaceDimension},
{@link setPrecision},
{@link setPrecisionAsString},
{@link setWorldCoordinateSystem},
{@link setTrueNorth},
{@link setHasSubContexts},
{@link setHasCoordinateOperation},
 */

@Description("")

public interface IfcGeometricRepresentationContext extends GenericEntity, ifc4.IfcRepresentationContext, ifc4.IfcCoordinateReferenceSystemSelect {

	EntityType<IfcGeometricRepresentationContext> T = EntityTypes.T(IfcGeometricRepresentationContext.class);

	/* Constants for each property name. */
	java.lang.String CoordinateSpaceDimension = "CoordinateSpaceDimension";
	java.lang.String Precision = "Precision";
	java.lang.String PrecisionAsString = "PrecisionAsString";
	java.lang.String WorldCoordinateSystem = "WorldCoordinateSystem";
	java.lang.String TrueNorth = "TrueNorth";
	java.lang.String HasSubContexts = "HasSubContexts";
	java.lang.String HasCoordinateOperation = "HasCoordinateOperation";

	@Description("")
	@Mandatory
	java.lang.Long getCoordinateSpaceDimension();
	void setCoordinateSpaceDimension(java.lang.Long CoordinateSpaceDimension);
	@Description("")
	@Mandatory
	java.lang.Double getPrecision();
	void setPrecision(java.lang.Double Precision);
	@Description("")
	@Mandatory
	java.lang.String getPrecisionAsString();
	void setPrecisionAsString(java.lang.String PrecisionAsString);
	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement getWorldCoordinateSystem();
	void setWorldCoordinateSystem(ifc4.IfcAxis2Placement WorldCoordinateSystem);
	@Description("")
	@Mandatory
	ifc4.IfcDirection getTrueNorth();
	void setTrueNorth(ifc4.IfcDirection TrueNorth);
	@Description("")
	
	java.util.List<ifc4.IfcGeometricRepresentationSubContext> getHasSubContexts();
	void setHasSubContexts(java.util.List<ifc4.IfcGeometricRepresentationSubContext> HasSubContexts);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcCoordinateOperation> getHasCoordinateOperation();
	void setHasCoordinateOperation(java.util.List<ifc4.IfcCoordinateOperation> HasCoordinateOperation);

}
