/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceTexture of the Data Model iai.
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
{@link RepeatS}, 
{@link RepeatT}, 
{@link Mode}, 
{@link TextureTransform}, 
{@link Parameter}, 
{@link IsMappedBy}, 
{@link UsedInStyles}, 

* It provides of then following operations (getters and setters)
{@link getRepeatS},
{@link getRepeatT},
{@link getMode},
{@link getTextureTransform},
{@link getParameter},
{@link getIsMappedBy},
{@link getUsedInStyles},
{@link setRepeatS},
{@link setRepeatT},
{@link setMode},
{@link setTextureTransform},
{@link setParameter},
{@link setIsMappedBy},
{@link setUsedInStyles},
 */

@Description("")

public interface IfcSurfaceTexture extends GenericEntity, ifc4.IfcPresentationItem {

	EntityType<IfcSurfaceTexture> T = EntityTypes.T(IfcSurfaceTexture.class);

	/* Constants for each property name. */
	java.lang.String RepeatS = "RepeatS";
	java.lang.String RepeatT = "RepeatT";
	java.lang.String Mode = "Mode";
	java.lang.String TextureTransform = "TextureTransform";
	java.lang.String Parameter = "Parameter";
	java.lang.String IsMappedBy = "IsMappedBy";
	java.lang.String UsedInStyles = "UsedInStyles";

	@Description("")
	@Mandatory
	ifc4.Tristate getRepeatS();
	void setRepeatS(ifc4.Tristate RepeatS);
	@Description("")
	@Mandatory
	ifc4.Tristate getRepeatT();
	void setRepeatT(ifc4.Tristate RepeatT);
	@Description("")
	@Mandatory
	java.lang.String getMode();
	void setMode(java.lang.String Mode);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianTransformationOperator2D getTextureTransform();
	void setTextureTransform(ifc4.IfcCartesianTransformationOperator2D TextureTransform);
	@Description("")
	
	java.util.List<java.lang.String> getParameter();
	void setParameter(java.util.List<java.lang.String> Parameter);

	@Description("")
	
	java.util.List<ifc4.IfcTextureCoordinate> getIsMappedBy();
	void setIsMappedBy(java.util.List<ifc4.IfcTextureCoordinate> IsMappedBy);

	@Description("")
	
	java.util.List<ifc4.IfcSurfaceStyleWithTextures> getUsedInStyles();
	void setUsedInStyles(java.util.List<ifc4.IfcSurfaceStyleWithTextures> UsedInStyles);

}
