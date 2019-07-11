/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPointOnSurface of the Data Model iai.
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
{@link BasisSurface}, 
{@link PointParameterU}, 
{@link PointParameterUAsString}, 
{@link PointParameterV}, 
{@link PointParameterVAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getBasisSurface},
{@link getPointParameterU},
{@link getPointParameterUAsString},
{@link getPointParameterV},
{@link getPointParameterVAsString},
{@link getDim},
{@link setBasisSurface},
{@link setPointParameterU},
{@link setPointParameterUAsString},
{@link setPointParameterV},
{@link setPointParameterVAsString},
{@link setDim},
 */

@Description("")

public interface IfcPointOnSurface extends GenericEntity, ifc4.IfcPoint {

	EntityType<IfcPointOnSurface> T = EntityTypes.T(IfcPointOnSurface.class);

	/* Constants for each property name. */
	java.lang.String BasisSurface = "BasisSurface";
	java.lang.String PointParameterU = "PointParameterU";
	java.lang.String PointParameterUAsString = "PointParameterUAsString";
	java.lang.String PointParameterV = "PointParameterV";
	java.lang.String PointParameterVAsString = "PointParameterVAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcSurface getBasisSurface();
	void setBasisSurface(ifc4.IfcSurface BasisSurface);
	@Description("")
	@Mandatory
	java.lang.Double getPointParameterU();
	void setPointParameterU(java.lang.Double PointParameterU);
	@Description("")
	@Mandatory
	java.lang.String getPointParameterUAsString();
	void setPointParameterUAsString(java.lang.String PointParameterUAsString);
	@Description("")
	@Mandatory
	java.lang.Double getPointParameterV();
	void setPointParameterV(java.lang.Double PointParameterV);
	@Description("")
	@Mandatory
	java.lang.String getPointParameterVAsString();
	void setPointParameterVAsString(java.lang.String PointParameterVAsString);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
