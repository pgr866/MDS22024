import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadonoticiasportada')
export class VistaListadonoticiasportada extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="Layoutprincipallistadonoticiasportada">
 <label style="flex-shrink: 0; align-self: center; font-size: 150%; width: 100%; text-align: center;" id="Labelnoticiasactualidadlistadonoticiasportada">Noticias de Actualidad</label>
 <vaadin-horizontal-layout theme="" style="flex-shrink: 0; justify-content: space-around; flex-wrap: wrap; padding: var(--lumo-space-m); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); flex-grow: 1; width: 100%;" id="Layoutlistadonoticiasportada"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
