import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; align-items: center; padding-right: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-left: var(--lumo-space-m); position: absolute; justify-content: space-between;" theme="spacing-l">
 <vaadin-horizontal-layout id="Layoutregistrarse" style="width: 100%; flex-shrink: 0; justify-content: center;">
  <label style="flex-shrink: 0; font-size: 400%; flex-grow: 0;" id="Labelregistrarse">Registrarse</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; width: 70%; flex-grow: 0; justify-content: space-between; height: 75%;" theme="spacing">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; justify-content: space-between;" theme="spacing-xs">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutemailregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl); flex-grow: 0;" id="Labelemailregistrarse">Email</label>
    <vaadin-text-field placeholder="Email" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldemailregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutnombreregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl);" id="Labelnombreregistrarse">Nombre</label>
    <vaadin-text-field placeholder="Nombre" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldnombreregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutapellidosregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);" id="Labelapellidosregistrarse">Apellidos</label>
    <vaadin-text-field placeholder="Apellidos" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldapellidosregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layouttelefonoregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);" id="Labeltelefonoregistrarse">Teléfono</label>
    <vaadin-text-field placeholder="Teléfono" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldtelefonoregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutfechanacimientoregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);" id="Labelfechanacimientoregistrarse">Fecha Nacimiento</label>
    <vaadin-text-field placeholder="Fecha Nacimiento (DD-MM-AAAA)" style="flex-shrink: 0; align-self: center; flex-grow: 1;" id="Textfieldfechanacimientoregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutapodoregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);" id="Labelapodoregistrarse">Nick</label>
    <vaadin-text-field placeholder="Nick" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutdniregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl);" id="Labeldniregistrarse">DNI</label>
    <vaadin-text-field placeholder="DNI" style="flex-shrink: 0; flex-grow: 1;" id="Textfielddniregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutntarjetaregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl);" id="Labelntarjetaregistrarse">Nº Tarjeta</label>
    <vaadin-text-field placeholder="Nº Tarjeta" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldntarjetaregistrarse"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;" id="Layoutcontrasenaregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl);" id="Labelcontrasenaregistrarse">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; flex-grow: 1;" has-value id="Passwordfieldcontrasenaregistrarse"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;" id="Layoutrepetircontrasenaregistrarse">
    <label style="width: 20%; flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-xl);" id="Labelrepetircontrasenaregistrarse">Repetir Contraseña</label>
    <vaadin-password-field placeholder="Repetir Contraseña" style="flex-shrink: 0; align-self: center; flex-grow: 1;" has-value id="Passwordfieldrepetircontrasenaregistrarse"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <label style="flex-shrink: 0; font-size: 120%; width: 100%; align-self: center; font-size: 100%; text-align: center; color: #FF0000;" id="Labelerrordatosregistrarse"></label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; justify-content: space-around; align-self: center; padding-top: var(--lumo-space-s); padding-bottom: var(--lumo-space-m);" id="Layoutcancelarenviarregistrarse">
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;" id="Cancelarregistrarse">
     Cancelar 
   </vaadin-button>
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;" id="Enviarregistrarse">
     Enviar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
