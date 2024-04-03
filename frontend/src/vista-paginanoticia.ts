import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-seccioncomentarios';
import './vista-mostrarnoticiaresumida';
import './vista-mostrarnoticiaextendida';
import './vista-mostrarvaloracionnoticia';

@customElement('vista-paginanoticia')
export class VistaPaginanoticia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-xl); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-xl); flex-grow: 0;" id="vaadinVerticalLayout">
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 200%; align-self: center;" id="label">Título Noticia</label>
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 100%; align-self: center;" id="label1">Temática</label>
  <vaadin-vertical-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;" id="vaadinHorizontalLayout">
    <img style="flex-shrink: 1; width: 95%; flex-grow: 0; z-index: -1; align-self: center;" src="https://imagenes.elpais.com/resizer/xb6jt6pm3nPIWdSvk8ikJp_3wCg=/1200x0/cloudfront-eu-central-1.images.arcpublishing.com/prisa/PC672K3NJRDJNGSA7ZEM2M6E6A.jpg" id="img">
    <vaadin-horizontal-layout style="width: 95%; flex-shrink: 0; justify-content: space-between; flex-grow: 0; align-self: center; height: 6%;">
     <vaadin-horizontal-layout style="flex-shrink: 0; height: 100%; align-self: center; justify-content: space-between; flex-grow: 1;" id="vaadinHorizontalLayout1">
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="label2">Fecha</label>
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="label3">Autor</label>
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="label4">Lugar</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 20%; height: 100%; justify-content: space-between;" id="vaadinHorizontalLayout2">
      <vista-mostrarvaloracionnoticia id="vistaMostrarvaloracionnoticia"></vista-mostrarvaloracionnoticia>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 95%; flex-shrink: 1; padding-top: var(--lumo-space-s); flex-grow: 0; padding-bottom: var(--lumo-space-l); align-self: center;" id="vaadinHorizontalLayout3">
    <vista-mostrarnoticiaresumida style="width: 100%; height: 100%; flex-shrink: 0; align-self: center;" id="vistaMostrarnoticiaresumida"></vista-mostrarnoticiaresumida>
    <vista-mostrarnoticiaextendida style="flex-shrink: 0; width: 100%; height: 100%; align-self: center;" id="vistaMostrarnoticiaextendida"></vista-mostrarnoticiaextendida>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;" id="vaadinVerticalLayout1">
  <vista-seccioncomentarios style="flex-shrink: 0; width: 100%; height: 100%;" id="vistaSeccioncomentarios"></vista-seccioncomentarios>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
